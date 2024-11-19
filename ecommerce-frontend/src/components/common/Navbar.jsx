import React from 'react';
import { Link } from 'react-router-dom';

const Navbar = () =>
{
    return (
        <nav className="bg-white shadow-lg">
            <div className="max-w-6xl mx-auto px-4">
                <div className="flex justify-between items-center h-16">
                    <Link to="/" className="font-bold text-xl text-blue-600">
                        BankApp
                    </Link>

                    <div className="hidden md:flex space-x-4">
                        <Link to="/dashboard" className="text-gray-700 hover:text-blue-600">
                            Dashboard
                        </Link>
                        <Link to="/transfer" className="text-gray-700 hover:text-blue-600">
                            Transfer
                        </Link>
                        <Link to="/transactions" className="text-gray-700 hover:text-blue-600">
                            Transactions
                        </Link>
                        <Link to="/profile" className="text-gray-700 hover:text-blue-600">
                            Profile
                        </Link>
                    </div>

                    <Link to="/login" className="bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700">
                        Login
                    </Link>
                </div>
            </div>
        </nav>
    );
};

export default Navbar;