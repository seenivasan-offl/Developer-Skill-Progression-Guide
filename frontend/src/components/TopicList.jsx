import React from "react";
import Typography from "@mui/material/Typography";
import List from "@mui/material/List";
import ListItem from "@mui/material/ListItem";
import ListItemText from "@mui/material/ListItemText";
import Collapse from "@mui/material/Collapse";
import Paper from "@mui/material/Paper";
import { useState } from "react";
import ExpandLess from "@mui/icons-material/ExpandLess";
import ExpandMore from "@mui/icons-material/ExpandMore";

const TopicList = ({ topics }) => {
  if (!topics || topics.length === 0) return <Typography>No topics found.</Typography>;

  return (
    <List>
      {topics.map((topic) => (
        <TopicItem key={topic.id} topic={topic} />
      ))}
    </List>
  );
};

const TopicItem = ({ topic }) => {
  const [open, setOpen] = useState(false);

  const handleToggle = () => setOpen(!open);

  return (
    <>
      <ListItem button onClick={handleToggle} sx={{ pl: 2 }}>
        <ListItemText
          primary={
            <Typography variant="subtitle1" fontWeight="bold">
              {topic.title}
            </Typography>
          }
        />
        {open ? <ExpandLess /> : <ExpandMore />}
      </ListItem>
      <Collapse in={open} timeout="auto" unmountOnExit>
        <Paper elevation={1} sx={{ m: 1, p: 1 }}>
          {topic.courses && topic.courses.length > 0 && (
            <>
              <Typography variant="body1" fontWeight="bold">
                Courses:
              </Typography>
              <List dense>
                {topic.courses.map((course, idx) => (
                  <ListItem key={idx} sx={{ pl: 4 }}>
                    <ListItemText primary={course} />
                  </ListItem>
                ))}
              </List>
            </>
          )}
          {topic.subtopics && topic.subtopics.length > 0 && (
            <>
              <Typography variant="body1" fontWeight="bold" sx={{ mt: 1 }}>
                Subtopics:
              </Typography>
              <TopicList topics={topic.subtopics} />
            </>
          )}
        </Paper>
      </Collapse>
    </>
  );
};

export default TopicList;
