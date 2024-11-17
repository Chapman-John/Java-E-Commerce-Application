# Java-Banking-Application

start mysql

brew services start mysql

check if it is running

brew services list

end mysql

brew services stop mysql


backend
mvn clean install -DskipTests 
mvn spring-boot:run 

frontend
npx create-react-app banking-frontend  
npm install react-router-dom tailwindcss @headlessui/react axios @mui/material @emotion/react @emotion/styled  
npm start
