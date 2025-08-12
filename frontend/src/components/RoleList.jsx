import React from "react";
import List from "@mui/material/List";
import ListItemButton from "@mui/material/ListItemButton";
import ListItemText from "@mui/material/ListItemText";
import Paper from "@mui/material/Paper";
import Typography from "@mui/material/Typography";
import Box from "@mui/material/Box";

const RoleList = ({ roles, onSelect }) => {
  if (!roles || roles.length === 0)
    return (
      <Typography
        variant="h6"
        sx={{ textAlign: "center", mt: 4, color: "text.secondary" }}
      >
        No roles found.
      </Typography>
    );

  return (
    <Paper
      elevation={6}
      sx={{
        mb: 3,
        borderRadius: 3,
        bgcolor: "background.paper",
        boxShadow: "0 8px 24px rgba(25, 118, 210, 0.15)",
      }}
    >
      <Box
        sx={{
          bgcolor: "#1565c0",
          borderTopLeftRadius: 12,
          borderTopRightRadius: 12,
          p: 2,
          color: "white",
          fontWeight: "bold",
          fontSize: 22,
          letterSpacing: 1,
          textAlign: "center",
          userSelect: "none",
          marginTop:8,
        }}
      >
        Roles
      </Box>
      <List sx={{ maxHeight: 320, overflowY: "auto" }}>
        {roles.map((role) => (
          <ListItemButton
            key={role.id}
            onClick={() => onSelect(role.id)}
            sx={{
              px: 3,
              py: 1.5,
              transition: "background-color 0.3s, color 0.3s",
              "&:hover": {
                bgcolor: "#1976d2",
                color: "white",
                borderRadius: 2,
                boxShadow: "0 4px 8px rgba(25, 118, 210, 0.3)",
              },
              "&.Mui-selected": {
                bgcolor: "#0d47a1",
                color: "white",
                fontWeight: "bold",
                borderRadius: 2,
              },
            }}
          >
            <ListItemText primary={role.name} />
          </ListItemButton>
        ))}
      </List>
    </Paper>
  );
};

export default RoleList;
