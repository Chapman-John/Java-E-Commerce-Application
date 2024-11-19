import React, { useState, useEffect } from 'react';
// import { Card, CardHeader, CardContent } from '@/components/common/Card';
import { Card } from '../components/common/Card';

const HomePage = () =>
{
  // const [accountBalance, setAccountBalance] = useState(0);
  // const [userName, setUserName] = useState('');
  const [loading, setLoading] = useState(true);

  useEffect(() =>
  {
    // Replace with your actual backend URL
    fetch('http://localhost:8080/api/account/summary')
      .then(response => response.json())
      .then(data =>
      {
        // setAccountBalance(data.balance);
        // setUserName(data.userName);
        setLoading(false);
      })
      .catch(error =>
      {
        console.error('Error fetching data:', error);
        setLoading(false);
      });
  }, []);

  return (
    <div className="min-h-screen bg-gray-100 p-8">
      <div className="max-w-4xl mx-auto">
        <h1 className="text-3xl font-bold text-gray-800 mb-8">Welcome to Online Banking</h1>

        {loading ? (
          <p className="text-gray-600">Loading...</p>
        ) : (
          <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
            <Card className="bg-white shadow-lg">
              {/* <CardHeader>
                <h2 className="text-xl font-semibold">Account Overview</h2>
              </CardHeader>
              <CardContent>
                <div className="space-y-4">
                  <div>
                    <p className="text-gray-600">Current Balance</p>
                    <p className="text-2xl font-bold text-green-600">
                      ${accountBalance.toFixed(2)}
                    </p>
                  </div>
                  <div>
                    <p className="text-gray-600">Account Holder</p>
                    <p className="text-lg font-semibold">{userName}</p>
                  </div>
                </div>
              </CardContent> */}
            </Card>

            <Card className="bg-white shadow-lg">
              {/* <CardHeader>
                <h2 className="text-xl font-semibold">Quick Actions</h2>
              </CardHeader>
              <CardContent>
                <div className="space-y-4">
                  <button className="w-full bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700 transition">
                    Transfer Money
                  </button>
                  <button className="w-full bg-green-600 text-white px-4 py-2 rounded hover:bg-green-700 transition">
                    Pay Bills
                  </button>
                  <button className="w-full bg-purple-600 text-white px-4 py-2 rounded hover:bg-purple-700 transition">
                    View Statements
                  </button>
                </div>
              </CardContent> */}
            </Card>
          </div>
        )}
      </div>
    </div>
  );
};

export default HomePage;