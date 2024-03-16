import axios from "axios";
import { useState, useEffect } from "react";

export default function Admin() {
  const [movies, setMovies] = useState({});
  useEffect(() => {
    const fetchMovies = async () => {
      const res = (await axios.get("http://localhost:8080/user/movies"));
      console.log(res);
      //   setMovies(res.data);
    };
  }, []);
  //   console.log(movies);
  return <>Hello from admin</>;
}
