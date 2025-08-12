import React from "react";
import Box from "@mui/material/Box";
import Typography from "@mui/material/Typography";

const Footer = () => (
  <Box
    sx={{
      position: "fixed",
      bottom: 0,
      left: 0,
      right: 0,
      bgcolor: "#1565c0",
      color: "white",
      textAlign: "center",
      py: 1.5,
      fontWeight: "bold",
      fontSize: 14,
      fontFamily: "'Segoe UI', Tahoma, Geneva, Verdana, sans-serif",
      boxShadow: "0 -2px 8px rgba(21, 101, 192, 0.6)",
      userSelect: "none",
      zIndex: 1300,
    }}
  >
    <Typography variant="body2">
      © 2025 Developer Course Roadmap. All rights reserved.
    </Typography>
  </Box>
);

export default Footer;
