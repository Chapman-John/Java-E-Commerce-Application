// import React from 'react';
// import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
// import HomePage from './pages/HomePage';

// function App()
// {
//   return (
//     <Router>
//       <Routes>
//         <Route path="/" element={<HomePage />} />
//       </Routes>
//     </Router>
//   );
// }

// export default App;

// import React from 'react';
// import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
// import { ModeToggle } from '../src/components/mode-toggle.tsx';
// import HomePage from './pages/HomePage';

// function App()
// {
//   return (
//     <Router>
//       <div className="min-h-screen bg-background">
//         <header className="sticky top-0 z-50 w-full border-b border-border/40 bg-background/95 backdrop-blur supports-[backdrop-filter]:bg-background/60">
//           <div className="container flex h-14 max-w-screen-2xl items-center justify-between">
//             <div className="mr-4 hidden md:flex">
//               <Link to="/" className="mr-6 flex items-center space-x-2">
//                 <span className="hidden font-bold sm:inline-block">
//                   Your Brand
//                 </span>
//               </Link>
//               <nav className="flex items-center space-x-6 text-sm font-medium">
//                 <Link
//                   to="/"
//                   className="transition-colors hover:text-foreground/80 text-foreground/60"
//                 >
//                   Home
//                 </Link>
//                 <Link
//                   to="/products"
//                   className="transition-colors hover:text-foreground/80 text-foreground/60"
//                 >
//                   Products
//                 </Link>
//               </nav>
//             </div>
//             <div className="flex items-center space-x-4">
//               <ModeToggle />
//             </div>
//           </div>
//         </header>

//         <main>
//           <Routes>
//             <Route path="/" element={<HomePage />} />
//           </Routes>
//         </main>
//       </div>
//     </Router>
//   );
// }

// export default App;


import React from 'react';
import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
import { ModeToggle } from '../src/components/mode-toggle.tsx';
import HomePage from './pages/HomePage.tsx';

function App()
{
  return (
    <Router>
      <div className="min-h-screen bg-background flex flex-col">
        <header className="sticky top-0 z-50 w-full border-b border-border/40 bg-background/95 backdrop-blur supports-[backdrop-filter]:bg-background/60">
          <div className="container flex h-14 max-w-screen-2xl items-center justify-between mx-auto px-4">
            <div className="mr-4 hidden md:flex">
              <Link to="/" className="mr-6 flex items-center space-x-2">
                <span className="hidden font-bold sm:inline-block">Your Brand</span>
              </Link>
              <nav className="flex items-center space-x-6 text-sm font-medium">
                <Link
                  to="/"
                  className="transition-colors hover:text-foreground/80 text-foreground/60"
                >
                  Home
                </Link>
                <Link
                  to="/products"
                  className="transition-colors hover:text-foreground/80 text-foreground/60"
                >
                  Products
                </Link>
              </nav>
            </div>
            <div className="flex items-center space-x-4">
              <ModeToggle />
            </div>
          </div>
        </header>
        <main className="flex-grow flex justify-center items-center">
          <Routes>
            <Route path="/" element={<HomePage />} />
          </Routes>
        </main>
      </div>
    </Router>
  );
}

export default App;
