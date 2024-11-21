// import React, { useEffect, useState } from 'react';
// import axios from 'axios';

// const HomePage = () =>
// {
//   const [homeData, setHomeData] = useState({
//     featuredProducts: [],
//     topCategories: [],
//     activePromotions: []
//   });

//   useEffect(() =>
//   {
//     axios.get("http://localhost:8080/api/home")
//       .then(response => setHomeData(response.data))
//       .catch(error => console.error("Error fetching home page data:", error));
//   }, []);

//   return (
//     <div>
//       <h1>Home Page</h1>
//       <h2>Featured Products</h2>
//       <ul>
//         {homeData.featuredProducts.map((product, index) => (
//           <li key={index}>{product.name}</li> // Adjust based on your ProductDTO structure
//         ))}
//       </ul>
//       <h2>Top Categories</h2>
//       <ul>
//         {homeData.topCategories.map((category, index) => (
//           <li key={index}>{category.name}</li> // Adjust based on your CategoryDTO structure
//         ))}
//       </ul>
//       <h2>Active Promotions</h2>
//       <ul>
//         {homeData.activePromotions.map((promotion, index) => (
//           <li key={index}>{promotion.name}</li> // Adjust based on your PromotionDTO structure
//         ))}
//       </ul>
//     </div>
//   );
// };

// export default HomePage;


import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card';
import { Badge } from '@/components/ui/badge';
import { Button } from '@/components/ui/button';
import
{
  Carousel,
  CarouselContent,
  CarouselItem,
  CarouselNext,
  CarouselPrevious
} from '@/components/ui/carousel';

const HomePage = () =>
{
  const [homeData, setHomeData] = useState({
    featuredProducts: [],
    topCategories: [],
    activePromotions: []
  });

  const [isLoading, setIsLoading] = useState(true);

  useEffect(() =>
  {
    axios.get("http://localhost:8080/api/home")
      .then(response =>
      {
        setHomeData(response.data);
        setIsLoading(false);
      })
      .catch(error =>
      {
        console.error("Error fetching home page data:", error);
        setIsLoading(false);
      });
  }, []);

  if (isLoading)
  {
    return (
      <div className="flex justify-center items-center h-screen">
        <div className="animate-spin rounded-full h-32 w-32 border-t-2 border-b-2 border-blue-500"></div>
      </div>
    );
  }

  return (
    <div className="container mx-auto px-4 py-8 space-y-8">
      {/* Featured Products Carousel */}
      <Card>
        <CardHeader>
          <CardTitle className="text-2xl font-bold text-gray-800">
            Featured Products
          </CardTitle>
        </CardHeader>
        <CardContent>
          <Carousel>
            <CarouselContent>
              {homeData.featuredProducts.map((product, index) => (
                <CarouselItem key={index} className="md:basis-1/2 lg:basis-1/3">
                  <div className="p-1">
                    <Card>
                      <CardContent className="flex flex-col items-center justify-center p-6">
                        <img
                          src={product.imageUrl || "/api/placeholder/300/200"}
                          alt={product.name}
                          className="w-full h-48 object-cover rounded-t-lg"
                        />
                        <div className="mt-4 text-center">
                          <h3 className="text-lg font-semibold">{product.name}</h3>
                          <p className="text-gray-600">${product.price}</p>
                          <Button className="mt-2">View Details</Button>
                        </div>
                      </CardContent>
                    </Card>
                  </div>
                </CarouselItem>
              ))}
            </CarouselContent>
            <CarouselPrevious />
            <CarouselNext />
          </Carousel>
        </CardContent>
      </Card>

      {/* Top Categories */}
      <Card>
        <CardHeader>
          <CardTitle className="text-2xl font-bold text-gray-800">
            Top Categories
          </CardTitle>
        </CardHeader>
        <CardContent>
          <div className="grid grid-cols-2 md:grid-cols-4 gap-4">
            {homeData.topCategories.map((category, index) => (
              <Badge
                key={index}
                variant="outline"
                className="p-4 flex items-center justify-center text-center text-sm font-medium"
              >
                {category.name}
              </Badge>
            ))}
          </div>
        </CardContent>
      </Card>

      {/* Active Promotions */}
      <Card>
        <CardHeader>
          <CardTitle className="text-2xl font-bold text-gray-800">
            Active Promotions
          </CardTitle>
        </CardHeader>
        <CardContent>
          <div className="grid md:grid-cols-2 lg:grid-cols-3 gap-4">
            {homeData.activePromotions.map((promotion, index) => (
              <Card key={index} className="hover:shadow-lg transition-shadow">
                <CardContent className="p-6">
                  <h3 className="text-xl font-semibold text-blue-600 mb-2">
                    {promotion.name}
                  </h3>
                  <p className="text-gray-600 mb-4">{promotion.description}</p>
                  <Badge variant="secondary">
                    {promotion.discountPercentage}% OFF
                  </Badge>
                </CardContent>
              </Card>
            ))}
          </div>
        </CardContent>
      </Card>
    </div>
  );
};

export default HomePage;