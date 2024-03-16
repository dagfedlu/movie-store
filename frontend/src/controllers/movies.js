import axios from "axios";

export const getAllMovies = async () => {
  try {
    const allMovies = await axios.get("http://localhost:8080/user/movies");
    return allMovies;
  } catch (error) {return error;}
};
