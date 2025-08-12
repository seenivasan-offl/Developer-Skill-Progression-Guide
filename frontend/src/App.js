import React, { useEffect, useState } from "react";
import axios from "axios";
import "./App.css";


import Container from "@mui/material/Container";
import Typography from "@mui/material/Typography";
import Box from "@mui/material/Box";
import Divider from "@mui/material/Divider";

import Header from "./components/Header";
import RoleList from "./components/RoleList";
import TopicList from "./components/TopicList";
import Footer from "./components/Footer";

function App() {
  const [roles, setRoles] = useState([]);
  const [selectedRole, setSelectedRole] = useState(null);

  useEffect(() => {
    axios
      .get("http://localhost:8080/api/roadmap/roles")
      .then((res) => setRoles(res.data))
      .catch((err) => console.error(err));
  }, []);

  const handleSelectRole = (roleId) => {
    axios
      .get(`http://localhost:8080/api/roadmap/role/${roleId}`)
      .then((res) => setSelectedRole(res.data))
      .catch((err) => console.error(err));
  };

  return (
    <Container maxWidth="md" sx={{ paddingTop: 4 }}>
      <Header />

      <Box mb={4}>
        <RoleList roles={roles} onSelect={handleSelectRole} />
      </Box>

      {selectedRole && (
        <Box>
          <Typography variant="h4" gutterBottom>
            {selectedRole.name} Roadmap
          </Typography>
          <Divider sx={{ mb: 2 }} />
          <TopicList topics={selectedRole.topics} />
        </Box>
      )}
      <Footer />
    </Container>
    
  );
}

export default App;
