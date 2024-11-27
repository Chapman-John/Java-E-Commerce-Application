import React from 'react';
import { Link } from 'react-router-dom';
import { ModeToggle } from './ModeToggle';

const Header: React.FC = () => (
    <header className="sticky top-0 z-50 w-full border-b">
        <div className="container flex items-center justify-between">
            <nav>
                <Link to="/">Home</Link>
                <Link to="/products">Products</Link>
            </nav>
            <ModeToggle />
        </div>
    </header>
);

export default Header;
