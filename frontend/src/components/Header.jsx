import React from "react";
import Typography from "@mui/material/Typography";
import Box from "@mui/material/Box";

const Header = () => (
  <Box
    sx={{
      position: "fixed",
      top: 0,
      left: 0,
      right: 0,
      height: 64,
      bgcolor: "primary.main", // uses MUI primary color
      display: "flex",
      alignItems: "center",
      justifyContent: "center",
      zIndex: 1300, // higher than default drawers/app bars
      boxShadow: 3,
      paddingX: 2,
      
    }}
  >
    <Typography
      variant="h5"
      component="h1"
      color="white"
      sx={{ fontWeight: "bold" }}
    >
      Developer Course Roadmap
    </Typography>
  </Box>
);

export default Header;
