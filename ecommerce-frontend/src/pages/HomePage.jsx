import React, { useEffect, useState } from 'react';
import axios from 'axios';

const HomePage = () =>
{
  const [message, setMessage] = useState("");

  useEffect(() =>
  {
    axios.get("http://localhost:8080/api/home")
      .then(response => setMessage(response.data))
      .catch(error => console.error("Error fetching home page data:", error));
  }, []);

  return (
    <div>
      <h1>Home Page</h1>
      <p>{message}</p>
    </div>
  );
};

export default HomePage;